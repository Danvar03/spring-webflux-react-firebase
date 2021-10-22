package co.com.sofka.questions.usecases;

import co.com.sofka.questions.collections.Answer;
import co.com.sofka.questions.model.AnswerDTO;
import co.com.sofka.questions.reposioties.AnswerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddAnswerUseCaseTest {

    @MockBean
    private AnswerRepository answerRepository;

    @SpyBean
    private AddAnswerUseCase addAnswerUseCase;


    @Test
    @DisplayName("consultar respuestas CRUD use case")
    public void setAddAnswerUseCaseTest(){
        var answerDTO = new AnswerDTO("zzz","xxx", "yyy", "Desarollar");
        var answer = new Answer();
        answer.setId("zzz");
        answer.setQuestionId("xxx");
        answer.setUserId("yyy");
        answer.setAnswer("Desarollar");


        Mockito.when(answerRepository.save(Mockito.any(Answer.class))).thenReturn(Mono.just(answer));
        var  datoAnswer = addAnswerUseCase.apply(answerDTO).block();
        Assertions.assertEquals(datoAnswer.getId(), "zzz");
        Assertions.assertEquals(datoAnswer.getId(), "xxx");
        Assertions.assertEquals(datoAnswer.getUserId(), "yyy");
        Assertions.assertEquals(datoAnswer.getAnswers(), "Desarollar");


    }
}