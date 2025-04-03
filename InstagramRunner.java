class InstagramRunner{

public static void main(String insta[]){

String ref = Instagram.logIn("radha","radhagmail.com","radha567878d");
System.out.println(ref);

String msg = Instagram.logIn(4567834567L,"radha567878d");
System.out.println(msg);

}
}