package co.com.sofka.questions.usecases;

import co.com.sofka.questions.collections.Question;
import co.com.sofka.questions.model.QuestionDTO;
import co.com.sofka.questions.reposioties.QuestionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import static org.mockito.Mockito.when;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Objects;


@SpringBootTest
class CreateUseCaseTest {

    @SpyBean
    private CreateUseCase createUseCase;

    @MockBean
    private QuestionRepository repository;

    @Test@DisplayName("crear preguntas")

    void createResource() {

        var resourceDT0 = new QuestionDTO("xxx", "yyy", "Que es Java?", "tecnologia",
                "TECNOLOGIA", 1, 2, Arrays.asList("xxx1", "xxx2"), "daniela.03v@gmail.com");

        var resource = new Question();
        resource.setId("xxx");
        resource.setUserId("yyy");
        resource.setQuestion("Que es Java?");
        resource.setType("tecnologia");
        resource.setCategory("TECNOLOGIA");
        resource.setNumberOfReviews(1);
        resource.setSumOfReviewScores(1);
        resource.setUserReviews(Arrays.asList("xxx1", "xxx2"));
        resource.setUserEmail("daniela.03v@gmail.com");

        when(repository.save(Mockito.any(Question.class))).thenReturn(Mono.just(resource));
        var result = createUseCase.apply(resourceDT0);

        Assertions.assertEquals(Objects.requireNonNull(result.block()),"xxx");
      }
    }