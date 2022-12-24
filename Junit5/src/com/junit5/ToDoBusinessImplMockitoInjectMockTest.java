package com.junit5;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(MockitoJunitRunner.class)
public class ToDoBusinessImplMockitoInjectMockTest {
	

	@Mock
	ToDoService todoServiceMock;
	
	@Test
	public void testRetriveTodoRelatedToSpring_usingAMock() {
		List<String>todos=Arrays.asList("Learn Spring MVC","Learn spring");
		when(todoServiceMock.retriveTodos("Dummy")).thenReturn(todos);
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(todoServiceMock);
		System.out.println(toDoBusinessImpl);
	}
}
