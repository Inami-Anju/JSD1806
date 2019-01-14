package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * �����ҷ����
 * @author adminitartor
 *
 */
public class Server {
	/*
	 * �����ڷ���˵�ServerSocket��Ҫ����������:
	 * 1:��ϵͳ�������˿ڣ��ͻ��˾���ͨ������˿���
	 *   ����˽������ӵġ�
	 * 2:��������˿ڣ�һ���ͻ��������˽������ӣ��ͻ�
	 *   �Զ�����һ��Socket����ͨ����Socket�뽨�����ӵ�
	 *   �ͻ��˽��н�����  
	 */
	private ServerSocket server;
	
	/*
	 * ����ÿ��ClientHandler��Ӧ�ͻ��˵������������
	 * �㲥��Ϣ
	 */
//	private PrintWriter[] allOut = {};
	private List<PrintWriter> allOut 
				= new ArrayList<PrintWriter>();
	
	public Server(){
		try {
			/*
			 * ʵ����ServerSocket��ͬʱ�������˿�
			 */
			System.out.println("�������������...");
			server = new ServerSocket(8088);
			System.out.println("������������!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start(){
		try {
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("һ���ͻ���������");
				/*
				 * ����һ���߳�������ÿͻ��˵Ľ���
				 */
				Runnable clientHandler = new ClientHandler(socket);
				Thread thread = new Thread(clientHandler);
				thread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	/**
	 * ���̵߳������Ǵ�����ָ���ͻ��˵Ľ�������
	 * @author adminitartor
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		//�ͻ��˵ĵ�ַ��Ϣ
		private String host;
		
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			//ͨ��socket��ȡԶ�˼�����ĵ�ַ��Ϣ
			InetAddress address = socket.getInetAddress();
			//��ȡIP��ַ���ַ�����ʽ:xxx.xxx.xxx.xxx
			host = address.getHostAddress();
			
		}
		
		public void run(){
			PrintWriter pw = null;
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				
				//��ȡ����������ڸ��ͻ��˷�����Ϣ
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw
					= new OutputStreamWriter(out, "UTF-8");
				BufferedWriter bw
					= new BufferedWriter(osw);
				
				pw = new PrintWriter(bw,true);
				/*
				 * ������������빲������allOut,����������
				 * ClientHandlerʵ��Ҳ���Է��ʵ���������
				 * �Ӷ����ÿͻ��˷�����Ϣ��
				 * 
				 * ����̲߳���ͬʱ��allOut���������Ԫ�أ�����
				 * ����ֲ�����ȫ
				 */
				synchronized (allOut) {
					//1��allOut��������
//					allOut = Arrays.copyOf(allOut, allOut.length+1);	
//					//2��������������������һ��λ��
//					allOut[allOut.length-1] = pw;
					
					allOut.add(pw);
				}
				
				
				String message = null;
				while((message = br.readLine())!=null){		
					System.out.println(host+":"+message);
					synchronized (allOut) {
						//����allOut�������пͻ��˷��͸���Ϣ
//						for(int i=0;i<allOut.length;i++){
//							allOut[i].println(host+":"+message);
//						}
						for(PrintWriter p : allOut){
							p.println(host+":"+message);
						}
					}
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				//����ͻ��˶Ͽ����Ӻ�Ĳ���
				/*
				 * 1 ����ǰ�ͻ��˶�Ӧ���������allOut 
				 *   ������ɾ��
				 */
				synchronized (allOut) {
//					for(int i=0;i<allOut.length;i++){
//						if(allOut[i]==pw){
//							//�����һ��Ԫ�����õ���λ��
//							allOut[i] = allOut[allOut.length-1];
//							allOut = Arrays.copyOf(allOut, allOut.length-1);
//							break;
//						}
//					}
					allOut.remove(pw);
				}
				
				/*
				 * 2����Socket�رգ��ͷ���Դ
				 */
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
	}
	
	
}








