class FaceBookRunner{

public static void main(String face[]){

String message = FaceBook.userLogin("radha@gmail.com","radhai5678");
System.out.println(message);

String ref = FaceBook.userLogin(5618726789L,"radhai5678");
System.out.println(ref);
}
}