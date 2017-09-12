package org.gkug.spek

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.context
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class FixtureSpec: Spek({
    describe("a group") {
        beforeGroup {
            println("Before Group")
        }

        beforeEachTest {
            println("Before Each Test Group")
        }

        context("a nested group") {

            beforeEachTest {
                println("Before Each Test on this context")
            }

            beforeEachTest {
                println("Another Before Each Test on this context")
            }

            it ("should work") { println("My test on the context") }
        }

        it("do something") { println("My test on the group") }

        afterEachTest {
            println("After Each Test Group")
        }

        afterGroup {
            println("After Test Group")
        }
    }
})