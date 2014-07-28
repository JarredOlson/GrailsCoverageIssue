package sample

import java.util.Random

class PersonController {

    def index() {
	int randomNumber = new Random().nextInt(10)
	if(randomNumber < 5) {
	    render('Random number is less than 5')
	} else {
	    render('Random number is greater or equal to 5')
	}
    }
}
