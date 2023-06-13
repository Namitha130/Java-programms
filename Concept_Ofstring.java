class Concept_Ofstring{
	public static void main(String[] args) {
		String s1 = "Namitha";
		String s2= " namitha T P";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('m'));
		System.out.println(s1.indexOf('m',3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.substring(0,3));
		System.out.println(s1.concat(s2));
	}
}