package com.igorwojda.binarytree.insert

import org.amshove.kluent.shouldEqual
import org.junit.Test

private data class Node<E : Comparable<E>>(
    var data: E,
    var left: Node<E>? = null,
    var right: Node<E>? = null
) {
    fun insert(e: E) {
    }

    fun contains(e: E): Boolean {
        return false
    }
}

class BinarySearchTreeTest {
    @Test
    fun `can insert correctly`() {
        // -- -------Tree------------
        //
        //           10
        //         /   \
        //        5     15
        //                \
        //                 17
        //
        // --------------------------

        val node = Node(10)
        node.insert(5)
        node.insert(15)
        node.insert(17)

        node.left?.data shouldEqual 5
        node.right?.data shouldEqual 15
        node.right?.right?.data shouldEqual 17
    }

    @Test
    fun `contains returns true when value is found`() {
        // -- -------Tree------------
        //
        //           10
        //          /  \
        //         5    15
        //        /       \
        //       0         20
        //      / \
        //    -5   3
        // --------------------------

        val node = Node(10)
        node.insert(5)
        node.insert(15)
        node.insert(20)
        node.insert(0)
        node.insert(-5)
        node.insert(3)

        node.contains(3) shouldEqual true
    }

    @Test
    fun `contains returns false if value not found`() {
        // -- -------Tree------------
        //
        //           10
        //          /  \
        //         5    15
        //        /       \
        //       0         20
        //      / \
        //    -5   3
        // --------------------------

        val node = Node(10)
        node.insert(5)
        node.insert(15)
        node.insert(20)
        node.insert(0)
        node.insert(-5)
        node.insert(3)

        node.contains(9999) shouldEqual false
    }
}
