package com.igorwojda.stack.generic

private object Solution {
    private class GenericStack<E> {
        val list = mutableListOf<E>()

        fun push(element: E) {
            list.add(element)
        }

        fun pop() = if (list.isEmpty()) null else list.removeAt(list.lastIndex)

        fun peek() = list.lastOrNull()
    }
}

private object KtLintWillNotComplain
