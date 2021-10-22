package co.com.sofka.questions.usecases;

import co.com.sofka.questions.collections.Question;
import co.com.sofka.questions.model.QuestionDTO;
import co.com.sofka.questions.reposioties.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;


@SpringBootTest
class GetUseCaseTest {

    @MockBean
    private QuestionRepository questionRepository;
    @SpyBean
    private GetUseCase getQuestion;

    @Test
    public void get(){

        var questionDTO = new QuestionDTO("1", "yyy", "Que es Java?", "tecnologia",
                "TECNOLOGIA", 1, 2, Arrays.asList("xxx1", "xxx2"), "daniela.03v@gmail.com");
        var resource= new Question();
        resource.setId("xxx");
        resource.setUserId("yyy");
        resource.setQuestion("Que es Java?");
        resource.setType("tecnologia");
        resource.setCategory("TECNOLOGIA");
        resource.setNumberOfReviews(1);
        resource.setSumOfReviewScores(1);
        resource.setUserReviews(Arrays.asList("xxx1", "xxx2"));
        resource.setUserEmail("daniela.03v@gmail.com");

        Mockito.when(questionRepository.findById(Mockito.any(String.class))).thenReturn(Mono.just(resource));

        var respuesta = getQuestion.apply("1");
        Assertions.assertEquals(respuesta.block().getQuestion(), "Que es Java?");
    }
}