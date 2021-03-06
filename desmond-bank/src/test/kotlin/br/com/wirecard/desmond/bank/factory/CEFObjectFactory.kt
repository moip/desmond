package br.com.wirecard.desmond.bank.factory

object CEFObjectFactory {
    const val VALID_AGENCY_NUMBER = "1234"
    const val VALID_ACCOUNT_NUMBER = "00112345678"
    const val VALID_CHECK_DIGIT = "2"
    const val VALID_AGENCY_NUMBER_REMAINDER_TEN = "0001"

    const val VALID_ACCOUNT_NUMBER_REMAINDER_TEN = "00000000020"
    const val VALID_CHECK_DIGIT_REMAINDER_TEN = "0"
    const val VALID_AGENCY_NUMBER_TWO_DIGITS = "12"

    const val VALID_ACCOUNT_NUMBER_TWO_DIGITS = "34"
    const val VALID_CHECK_DIGIT_NUMBER_TWO_DIGITS = "0"

    const val INVALID_LENGTH_ACCOUNT_NUMBER = "0000000000000000"
    const val INVALID_LENGTH_AGENCY_NUMBER = "00000"
    const val INVALID_CHECK_DIGIT = "9"
    const val INVALID_EMPTY_CHECK_DIGIT = ""
}