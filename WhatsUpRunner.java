class WhatsUpRunner{

public static void main(String msg[]){

String message = Messenger.registration("radha@gmail.com","radha5678");
System.out.println(message);

String ref = Messenger.registration("9876543210","radha5678");
System.out.println(ref);

}
}