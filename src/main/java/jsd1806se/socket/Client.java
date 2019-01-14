package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 * �����ҿͻ���
 * @author adminitartor
 *
 */
public class Client {
	/**
	 * �׽���
	 * ��װ��TCPЭ���ͨѶϸ�ڣ������ǿ��Լ򵥵�ʹ����
	 * ���TCPͨѶ��
	 * Socket���Ӻ��ṩ����������ͨ���������Ķ�д����
	 * �����Զ�˼���������ݽ�����
	 */
	private Socket socket;
	/**
	 * ������ʼ���ͻ���
	 */
	public Client(){
		try {
			/*
			 * ʵ����Socketʱ��Ҫ������������:
			 * 1:����˵�IP��ַ
			 * 2:����˵Ķ˿ں�
			 * ͨ��IP��ַ�����ҵ���������ڵļ������ͨ
			 * ���˿ڿ����ҵ������ڷ���˼�����ϵķ����
			 * Ӧ�ó���
			 * ע�⣬ʵ����Socket�Ĺ��̾������ӵĹ��̣���
			 * ����ʧ�ܻ��׳��쳣
			 * 
			 */
			System.out.println("�������ӷ����...");
			BufferedReader br = new BufferedReader(
				new InputStreamReader(
					new FileInputStream("config.txt")
				)	
			);
			String host = br.readLine();
			int port = Integer.parseInt(br.readLine());
			
			socket = new Socket(host, port);
			System.out.println("�����˽�������!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start(){
		try {
			//��������ȡ�������Ϣ���߳�
			ServerHandler handler = new ServerHandler();
			Thread thread = new Thread(handler);
			thread.start();
			
			
			/*
			 * Socket�ṩ�ķ���
			 * OutputStream getOutputStream()
			 * �÷�����ȡһ���ֽ��������ͨ������д����
			 * ���ݻᷢ�͸�Զ�˼���� 
			 */
			OutputStream out 
				= socket.getOutputStream();
			OutputStreamWriter osw
				= new OutputStreamWriter(out,"UTF-8");
			BufferedWriter bw
				= new BufferedWriter(osw);
			PrintWriter pw
				= new PrintWriter(bw,true);
			
		
			Scanner scanner = new Scanner(System.in);
			while(true){
				String line = scanner.nextLine();
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	
	/**
	 * ���̸߳���ѭ����ȡ����˷��͹�������Ϣ
	 * @author adminitartor
	 *
	 */
	private class ServerHandler implements Runnable{
		public void run(){
			try {
				//��ȡ����������ȡ����˷��͹�������Ϣ
				InputStream in = socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				
				String line = null;
				while((line = br.readLine())!=null){
					System.out.println(line);
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}



















