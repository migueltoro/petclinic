package org.grails.samples

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Veterinarian)
class VetSpec extends Specification implements DomainDataFactory {
	
	Veterinarian vet = validVet()
	
	def setup() {
		mockForConstraintsTests Veterinarian
	}
	
	def 'a valid Vet has no errors'() {
		when:
		vet.validate()
		
		then:
		!vet.hasErrors()
		!vet.specialities
	}
}
