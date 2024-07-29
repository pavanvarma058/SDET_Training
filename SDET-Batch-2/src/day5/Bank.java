package day5;

public class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
class ICIC extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class AXIS extends Bank{
	int getRateOfInterest() {
		return 9;
	}
}
class HDFC extends Bank{
	@Override
	int getRateOfInterest() {
		return 9;
	}
}
class UNION extends Bank{
	int getRateOfInterest() {
		return 9;
	}
}
