class WechatRunner{

public static void main(String snap[]){

String message = SnapChat.logIn("radha","radha78");
System.out.println(message);

String ref = SnapChat.logIn(5097575890L,"radha78");
System.out.println(ref);
}
}