package br.com.wirecard.desmond.bank.factory

object BradescoObjectFactory {
    const val VALID_AGENCY_NUMBER = "1234"
    const val VALID_ACCOUNT_NUMBER = "0001234"
    const val VALID_CHECK_DIGIT = "3"

    const val VALID_AGENCY_NUMBER_REMAINDER_ZERO = "0031"
    const val VALID_ACCOUNT_NUMBER_REMAINDER_ZERO = "0000031"
    const val VALID_CHECK_DIGIT_REMAINDER_ZERO = "0"

    const val VALID_AGENCY_NUMBER_REMAINDER_ONE = "0071"
    const val VALID_ACCOUNT_NUMBER_REMAINDER_ONE = "0000071"
    const val VALID_CHECK_DIGIT_REMAINDER_ONE = "P"

    const val VALID_NUMBER_TWO_DIGITS = "31"
    const val VALID_CHECK_DIGIT_NUMBER_TWO_DIGITS = "0"

    const val INVALID_LENGTH_AGENCY_NUMBER = "00000"
    const val INVALID_LENGTH_ACCOUNT_NUMBER = "00000000"
    const val INVALID_EMPTY_CHECK_DIGIT = ""
    const val INVALID_CHECK_DIGIT = "2"
}