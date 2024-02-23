package com.acme.todolist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.acme.todolist.adapters.persistence.TodoItemJpaEntity;
import com.acme.todolist.adapters.persistence.TodoItemPersistenceAdapter;
import com.acme.todolist.domain.TodoItem;
import com.acme.todolist.adapters.persistence.TodoItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Instant;
import java.time.LocalDateTime;

public class TodoServiceTest {

    @Test
    public void testStoreNewTodoItem() {
        Instant todayTime = Instant.now();
        TodoItem mockItem = new TodoItem("1", todayTime, "Test TodoItem");
        assertEquals( "Faire les courses", mockItem.finalContent(), "Contenue identique");

    }
}

