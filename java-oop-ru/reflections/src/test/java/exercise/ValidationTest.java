package exercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class ValidationTest {

    @Test
    void testValidate() {
        Address address1 = new Address("Russia", "Ufa", "Lenina", "54", null);
        List<String> result1 = Validator.validate(address1);
        List<String> expected1 = List.of();
        assertThat(result1).isEqualTo(expected1);

        Address address2 = new Address(null, "London", "1-st street", "5", "1");
        List<String> result2 = Validator.validate(address2);
        List<String> expected2 = List.of("country");
        assertThat(result2).isEqualTo(expected2);

        Address address3 = new Address("USA", null, null, null, "1");
        List<String> result3 = Validator.validate(address3);
        List<String> expected3 = List.of("city", "street", "houseNumber");
        assertThat(result3).isEqualTo(expected3);
    }

    @Test
    void testValidateTeacherVersion() {
        Address address1 = new Address("Russia", "Ufa", "Lenina", "54", null);
        List<String> result1 = ValidatorTeacherVersion.validate(address1);
        List<String> expected1 = List.of();
        assertThat(result1).isEqualTo(expected1);

        Address address2 = new Address(null, "London", "1-st street", "5", "1");
        List<String> result2 = ValidatorTeacherVersion.validate(address2);
        List<String> expected2 = List.of("country");
        assertThat(result2).isEqualTo(expected2);

        Address address3 = new Address("USA", null, null, null, "1");
        List<String> result3 = ValidatorTeacherVersion.validate(address3);
        List<String> expected3 = List.of("city", "street", "houseNumber");
        assertThat(result3).isEqualTo(expected3);
    }

//    void testValidate() {
//        Address address1 = new Address("Russia", "Ufa", "Lenina", "54", null);
//        List<String> result1 = Validator.validate(address1);
//        List<String> expected1 = List.of();
//        assertThat(result1).isEqualTo(expected1);
//
//        Address address2 = new Address(null, "London", "1-st street", "5", "1");
//        List<String> result2 = Validator.validate(address2);
//        List<String> expected2 = List.of("country");
//        assertThat(result2).isEqualTo(expected2);
//
//        Address address3 = new Address("USA", null, null, null, "1");
//        List<String> result3 = Validator.validate(address3);
//        List<String> expected3 = List.of("city", "street", "houseNumber");
//        assertThat(result3).isEqualTo(expected3);
}

