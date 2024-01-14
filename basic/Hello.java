package basic;
class Hello{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}

// 把文件名保存为：Hello.java；
// 打开 cmd 命令窗口，进入目标文件所在的位置，假设是 C:\
// 在命令行窗口输入 javac Hello.java 按下回车键编译代码。如果代码没有错误，cmd 命令提示符会进入下一行（假设环境变量都设置好了）。
// 再键输入 java Hello 按下回车键就可以运行程序了
// 大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
// 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
// 方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
// 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。
// 主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行。