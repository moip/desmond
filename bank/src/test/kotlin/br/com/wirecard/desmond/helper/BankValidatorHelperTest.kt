package br.com.wirecard.desmond.helper

import com.winterbe.expekt.should
import org.junit.Test
import br.com.wirecard.desmond.helper.BankGeneratorHelper as bankValidatorHelper
import br.com.wirecard.desmond.helper.HelperObjectFactory as objectFactory

class BankValidatorHelperTest {
    @Test
    fun shouldReturnCorrectResultWhenMultiplyingByWeight() {
        val fakeNumber = objectFactory.FAKE_NUMBER
        val fakeWeight = objectFactory.FAKE_WEIGHT
        val result = objectFactory.EXPECTED_OUTPUT_MULTIPLY_WEIGHT
        bankValidatorHelper.multiplyByWeight(fakeNumber, fakeWeight).should.equal(result)
    }
}