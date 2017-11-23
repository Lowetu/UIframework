package com.UIframework.Class2;


import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import net.sourceforge.htmlunit.cyberneko.HTMLElements.ElementList;


public class readXML {

	public static void main(String[] args) throws DocumentException {
		//1、新建一个saxReader对象，读取XML文件
		SAXReader saxReader = new SAXReader();
		
		//2、新建一个Document,接收saxReader读取XML的返回
		Document document = saxReader.read(new File("./Students.xml"));
		
		//3、从document里面拿到根节点，并查看根节点的标签名称
		Element root = document.getRootElement();
		System.out.println(root.getName());//根节点标签
		//4、读取root节点下一层的全部数据，用list存起来，并取一条数据查看。若有多层，分层取
		List<Element> childList = root.elements();
			for(int i=0;i<childList.size();i++) {
				//5、通过标签名取root节点下面的部分元素
				//6、取标签名和文本属性，一个标签中间的那个值
				System.out.println("标签名："+childList.get(i).getName());
				System.out.println("文本值："+childList.get(i).getText());
				//7、取标签的属性：姓名、年龄等
				System.out.println("姓名："+childList.get(i).attributeValue("name"));
				System.out.println("年龄："+childList.get(i).attributeValue("age"));
				System.out.println("-------------------------------------");
			}
			for(Element stus:childList) {
				System.out.println("标签："+stus.getName());
				System.out.println("文本值："+stus.getText());
				System.out.println("姓名"+stus.attributeValue("name"));
				System.out.println("年龄"+stus.attributeValue("age"));
				System.out.println("******************");
			}
		
	}

}
