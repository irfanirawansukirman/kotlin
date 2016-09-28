/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/ir/irText")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrTextTestCaseGenerated extends AbstractIrTextTestCase {
    public void testAllFilesPresentInIrText() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irText"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("compiler/testData/ir/irText/classes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Classes extends AbstractIrTextTestCase {
        public void testAllFilesPresentInClasses() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irText/classes"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("argumentReorderingInDelegatingConstructorCall.kt")
        public void testArgumentReorderingInDelegatingConstructorCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/argumentReorderingInDelegatingConstructorCall.kt");
            doTest(fileName);
        }

        @TestMetadata("classMembers.kt")
        public void testClassMembers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/classMembers.kt");
            doTest(fileName);
        }

        @TestMetadata("classes.kt")
        public void testClasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/classes.kt");
            doTest(fileName);
        }

        @TestMetadata("companionObject.kt")
        public void testCompanionObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/companionObject.kt");
            doTest(fileName);
        }

        @TestMetadata("dataClasses.kt")
        public void testDataClasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/dataClasses.kt");
            doTest(fileName);
        }

        @TestMetadata("delegatedImplementation.kt")
        public void testDelegatedImplementation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/delegatedImplementation.kt");
            doTest(fileName);
        }

        @TestMetadata("delegatedImplementationWithExplicitOverride.kt")
        public void testDelegatedImplementationWithExplicitOverride() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/delegatedImplementationWithExplicitOverride.kt");
            doTest(fileName);
        }

        @TestMetadata("delegatingConstructorCallsInSecondaryConstructors.kt")
        public void testDelegatingConstructorCallsInSecondaryConstructors() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/delegatingConstructorCallsInSecondaryConstructors.kt");
            doTest(fileName);
        }

        @TestMetadata("enum.kt")
        public void testEnum() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/enum.kt");
            doTest(fileName);
        }

        @TestMetadata("enumWithSecondaryCtor.kt")
        public void testEnumWithSecondaryCtor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/enumWithSecondaryCtor.kt");
            doTest(fileName);
        }

        @TestMetadata("initBlock.kt")
        public void testInitBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/initBlock.kt");
            doTest(fileName);
        }

        @TestMetadata("initVal.kt")
        public void testInitVal() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/initVal.kt");
            doTest(fileName);
        }

        @TestMetadata("initVar.kt")
        public void testInitVar() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/initVar.kt");
            doTest(fileName);
        }

        @TestMetadata("innerClass.kt")
        public void testInnerClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/innerClass.kt");
            doTest(fileName);
        }

        @TestMetadata("localClasses.kt")
        public void testLocalClasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/localClasses.kt");
            doTest(fileName);
        }

        @TestMetadata("objectLiteralExpressions.kt")
        public void testObjectLiteralExpressions() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/objectLiteralExpressions.kt");
            doTest(fileName);
        }

        @TestMetadata("objectWithInitializers.kt")
        public void testObjectWithInitializers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/objectWithInitializers.kt");
            doTest(fileName);
        }

        @TestMetadata("primaryConstructor.kt")
        public void testPrimaryConstructor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/primaryConstructor.kt");
            doTest(fileName);
        }

        @TestMetadata("primaryConstructorWithSuperConstructorCall.kt")
        public void testPrimaryConstructorWithSuperConstructorCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/primaryConstructorWithSuperConstructorCall.kt");
            doTest(fileName);
        }

        @TestMetadata("qualifiedSuperCalls.kt")
        public void testQualifiedSuperCalls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/qualifiedSuperCalls.kt");
            doTest(fileName);
        }

        @TestMetadata("sealedClasses.kt")
        public void testSealedClasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/sealedClasses.kt");
            doTest(fileName);
        }

        @TestMetadata("secondaryConstructorWithInitializersFromClassBody.kt")
        public void testSecondaryConstructorWithInitializersFromClassBody() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/secondaryConstructorWithInitializersFromClassBody.kt");
            doTest(fileName);
        }

        @TestMetadata("secondaryConstructors.kt")
        public void testSecondaryConstructors() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/secondaryConstructors.kt");
            doTest(fileName);
        }

        @TestMetadata("superCalls.kt")
        public void testSuperCalls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/classes/superCalls.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/ir/irText/declarations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Declarations extends AbstractIrTextTestCase {
        public void testAllFilesPresentInDeclarations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irText/declarations"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("classLevelProperties.kt")
        public void testClassLevelProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/classLevelProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("defaultArguments.kt")
        public void testDefaultArguments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/defaultArguments.kt");
            doTest(fileName);
        }

        @TestMetadata("delegatedProperties.kt")
        public void testDelegatedProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/delegatedProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("fileWithAnnotations.kt")
        public void testFileWithAnnotations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/fileWithAnnotations.kt");
            doTest(fileName);
        }

        @TestMetadata("interfaceProperties.kt")
        public void testInterfaceProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/interfaceProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("localDelegatedProperties.kt")
        public void testLocalDelegatedProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/localDelegatedProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("packageLevelProperties.kt")
        public void testPackageLevelProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/packageLevelProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("primaryCtorDefaultArguments.kt")
        public void testPrimaryCtorDefaultArguments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/primaryCtorDefaultArguments.kt");
            doTest(fileName);
        }

        @TestMetadata("primaryCtorProperties.kt")
        public void testPrimaryCtorProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/primaryCtorProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("typeAlias.kt")
        public void testTypeAlias() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/declarations/typeAlias.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/ir/irText/errors")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Errors extends AbstractIrTextTestCase {
        public void testAllFilesPresentInErrors() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irText/errors"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("suppressedNonPublicCall.kt")
        public void testSuppressedNonPublicCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/errors/suppressedNonPublicCall.kt");
            doTest(fileName);
        }

        @TestMetadata("unresolvedReference.kt")
        public void testUnresolvedReference() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/errors/unresolvedReference.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/ir/irText/expressions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Expressions extends AbstractIrTextTestCase {
        public void testAllFilesPresentInExpressions() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irText/expressions"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("arrayAccess.kt")
        public void testArrayAccess() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/arrayAccess.kt");
            doTest(fileName);
        }

        @TestMetadata("arrayAssignment.kt")
        public void testArrayAssignment() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/arrayAssignment.kt");
            doTest(fileName);
        }

        @TestMetadata("arrayAugmentedAssignment1.kt")
        public void testArrayAugmentedAssignment1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/arrayAugmentedAssignment1.kt");
            doTest(fileName);
        }

        @TestMetadata("arrayAugmentedAssignment2.kt")
        public void testArrayAugmentedAssignment2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/arrayAugmentedAssignment2.kt");
            doTest(fileName);
        }

        @TestMetadata("assignments.kt")
        public void testAssignments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/assignments.kt");
            doTest(fileName);
        }

        @TestMetadata("augmentedAssignment1.kt")
        public void testAugmentedAssignment1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/augmentedAssignment1.kt");
            doTest(fileName);
        }

        @TestMetadata("augmentedAssignment2.kt")
        public void testAugmentedAssignment2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/augmentedAssignment2.kt");
            doTest(fileName);
        }

        @TestMetadata("augmentedAssignmentWithExpression.kt")
        public void testAugmentedAssignmentWithExpression() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/augmentedAssignmentWithExpression.kt");
            doTest(fileName);
        }

        @TestMetadata("badBreakContinue.kt")
        public void testBadBreakContinue() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/badBreakContinue.kt");
            doTest(fileName);
        }

        @TestMetadata("bangbang.kt")
        public void testBangbang() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/bangbang.kt");
            doTest(fileName);
        }

        @TestMetadata("booleanOperators.kt")
        public void testBooleanOperators() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/booleanOperators.kt");
            doTest(fileName);
        }

        @TestMetadata("boundCallableReferences.kt")
        public void testBoundCallableReferences() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/boundCallableReferences.kt");
            doTest(fileName);
        }

        @TestMetadata("boxOk.kt")
        public void testBoxOk() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/boxOk.kt");
            doTest(fileName);
        }

        @TestMetadata("breakContinue.kt")
        public void testBreakContinue() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/breakContinue.kt");
            doTest(fileName);
        }

        @TestMetadata("breakContinueInLoopHeader.kt")
        public void testBreakContinueInLoopHeader() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/breakContinueInLoopHeader.kt");
            doTest(fileName);
        }

        @TestMetadata("callWithReorderedArguments.kt")
        public void testCallWithReorderedArguments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/callWithReorderedArguments.kt");
            doTest(fileName);
        }

        @TestMetadata("calls.kt")
        public void testCalls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/calls.kt");
            doTest(fileName);
        }

        @TestMetadata("chainOfSafeCalls.kt")
        public void testChainOfSafeCalls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/chainOfSafeCalls.kt");
            doTest(fileName);
        }

        @TestMetadata("coercionToUnit.kt")
        public void testCoercionToUnit() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/coercionToUnit.kt");
            doTest(fileName);
        }

        @TestMetadata("complexAugmentedAssignment.kt")
        public void testComplexAugmentedAssignment() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/complexAugmentedAssignment.kt");
            doTest(fileName);
        }

        @TestMetadata("conventionComparisons.kt")
        public void testConventionComparisons() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/conventionComparisons.kt");
            doTest(fileName);
        }

        @TestMetadata("destructuring1.kt")
        public void testDestructuring1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/destructuring1.kt");
            doTest(fileName);
        }

        @TestMetadata("dotQualified.kt")
        public void testDotQualified() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/dotQualified.kt");
            doTest(fileName);
        }

        @TestMetadata("elvis.kt")
        public void testElvis() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/elvis.kt");
            doTest(fileName);
        }

        @TestMetadata("equality.kt")
        public void testEquality() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/equality.kt");
            doTest(fileName);
        }

        @TestMetadata("extensionPropertyGetterCall.kt")
        public void testExtensionPropertyGetterCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/extensionPropertyGetterCall.kt");
            doTest(fileName);
        }

        @TestMetadata("field.kt")
        public void testField() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/field.kt");
            doTest(fileName);
        }

        @TestMetadata("for.kt")
        public void testFor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/for.kt");
            doTest(fileName);
        }

        @TestMetadata("forWithBreakContinue.kt")
        public void testForWithBreakContinue() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/forWithBreakContinue.kt");
            doTest(fileName);
        }

        @TestMetadata("forWithImplicitReceivers.kt")
        public void testForWithImplicitReceivers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/forWithImplicitReceivers.kt");
            doTest(fileName);
        }

        @TestMetadata("identity.kt")
        public void testIdentity() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/identity.kt");
            doTest(fileName);
        }

        @TestMetadata("ifElseIf.kt")
        public void testIfElseIf() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/ifElseIf.kt");
            doTest(fileName);
        }

        @TestMetadata("implicitCastOnPlatformType.kt")
        public void testImplicitCastOnPlatformType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/implicitCastOnPlatformType.kt");
            doTest(fileName);
        }

        @TestMetadata("in.kt")
        public void testIn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/in.kt");
            doTest(fileName);
        }

        @TestMetadata("incrementDecrement.kt")
        public void testIncrementDecrement() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/incrementDecrement.kt");
            doTest(fileName);
        }

        @TestMetadata("jvmInstanceFieldReference.kt")
        public void testJvmInstanceFieldReference() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/jvmInstanceFieldReference.kt");
            doTest(fileName);
        }

        @TestMetadata("jvmStaticFieldReference.kt")
        public void testJvmStaticFieldReference() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/jvmStaticFieldReference.kt");
            doTest(fileName);
        }

        @TestMetadata("literals.kt")
        public void testLiterals() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/literals.kt");
            doTest(fileName);
        }

        @TestMetadata("primitiveComparisons.kt")
        public void testPrimitiveComparisons() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/primitiveComparisons.kt");
            doTest(fileName);
        }

        @TestMetadata("references.kt")
        public void testReferences() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/references.kt");
            doTest(fileName);
        }

        @TestMetadata("reflectionLiterals.kt")
        public void testReflectionLiterals() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/reflectionLiterals.kt");
            doTest(fileName);
        }

        @TestMetadata("safeAssignment.kt")
        public void testSafeAssignment() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/safeAssignment.kt");
            doTest(fileName);
        }

        @TestMetadata("safeCallWithIncrementDecrement.kt")
        public void testSafeCallWithIncrementDecrement() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/safeCallWithIncrementDecrement.kt");
            doTest(fileName);
        }

        @TestMetadata("safeCalls.kt")
        public void testSafeCalls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/safeCalls.kt");
            doTest(fileName);
        }

        @TestMetadata("setFieldWithImplicitCast.kt")
        public void testSetFieldWithImplicitCast() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/setFieldWithImplicitCast.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleOperators.kt")
        public void testSimpleOperators() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/simpleOperators.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleUnaryOperators.kt")
        public void testSimpleUnaryOperators() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/simpleUnaryOperators.kt");
            doTest(fileName);
        }

        @TestMetadata("smartCasts.kt")
        public void testSmartCasts() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/smartCasts.kt");
            doTest(fileName);
        }

        @TestMetadata("smartCastsWithDestructuring.kt")
        public void testSmartCastsWithDestructuring() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/smartCastsWithDestructuring.kt");
            doTest(fileName);
        }

        @TestMetadata("smoke.kt")
        public void testSmoke() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/smoke.kt");
            doTest(fileName);
        }

        @TestMetadata("stringComparisons.kt")
        public void testStringComparisons() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/stringComparisons.kt");
            doTest(fileName);
        }

        @TestMetadata("stringPlus.kt")
        public void testStringPlus() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/stringPlus.kt");
            doTest(fileName);
        }

        @TestMetadata("stringTemplates.kt")
        public void testStringTemplates() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/stringTemplates.kt");
            doTest(fileName);
        }

        @TestMetadata("throw.kt")
        public void testThrow() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/throw.kt");
            doTest(fileName);
        }

        @TestMetadata("tryCatch.kt")
        public void testTryCatch() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/tryCatch.kt");
            doTest(fileName);
        }

        @TestMetadata("tryCatchWithImplicitCast.kt")
        public void testTryCatchWithImplicitCast() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/tryCatchWithImplicitCast.kt");
            doTest(fileName);
        }

        @TestMetadata("typeArguments.kt")
        public void testTypeArguments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/typeArguments.kt");
            doTest(fileName);
        }

        @TestMetadata("typeOperators.kt")
        public void testTypeOperators() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/typeOperators.kt");
            doTest(fileName);
        }

        @TestMetadata("values.kt")
        public void testValues() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/values.kt");
            doTest(fileName);
        }

        @TestMetadata("vararg.kt")
        public void testVararg() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/vararg.kt");
            doTest(fileName);
        }

        @TestMetadata("varargWithImplicitCast.kt")
        public void testVarargWithImplicitCast() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/varargWithImplicitCast.kt");
            doTest(fileName);
        }

        @TestMetadata("variableAsFunctionCall.kt")
        public void testVariableAsFunctionCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/variableAsFunctionCall.kt");
            doTest(fileName);
        }

        @TestMetadata("when.kt")
        public void testWhen() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/when.kt");
            doTest(fileName);
        }

        @TestMetadata("whenElse.kt")
        public void testWhenElse() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/whenElse.kt");
            doTest(fileName);
        }

        @TestMetadata("whenReturn.kt")
        public void testWhenReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/whenReturn.kt");
            doTest(fileName);
        }

        @TestMetadata("whileDoWhile.kt")
        public void testWhileDoWhile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/expressions/whileDoWhile.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/ir/irText/lambdas")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Lambdas extends AbstractIrTextTestCase {
        public void testAllFilesPresentInLambdas() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irText/lambdas"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("anonymousFunction.kt")
        public void testAnonymousFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/lambdas/anonymousFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("extensionLambda.kt")
        public void testExtensionLambda() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/lambdas/extensionLambda.kt");
            doTest(fileName);
        }

        @TestMetadata("justLambda.kt")
        public void testJustLambda() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/lambdas/justLambda.kt");
            doTest(fileName);
        }

        @TestMetadata("localFunction.kt")
        public void testLocalFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/lambdas/localFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("multipleImplicitReceivers.kt")
        public void testMultipleImplicitReceivers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/lambdas/multipleImplicitReceivers.kt");
            doTest(fileName);
        }

        @TestMetadata("nonLocalReturn.kt")
        public void testNonLocalReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/lambdas/nonLocalReturn.kt");
            doTest(fileName);
        }

        @TestMetadata("samAdapter.kt")
        public void testSamAdapter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/lambdas/samAdapter.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/ir/irText/regressions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Regressions extends AbstractIrTextTestCase {
        public void testAllFilesPresentInRegressions() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irText/regressions"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("coercionInLoop.kt")
        public void testCoercionInLoop() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/irText/regressions/coercionInLoop.kt");
            doTest(fileName);
        }
    }
}
