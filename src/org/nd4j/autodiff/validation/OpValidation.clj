(ns org.nd4j.autodiff.validation.OpValidation
  "Main test case runner for validating ops used in SameDiff.
 This OpValidation class also collects test coverage information, to determine the op test coverage, for both
 op outputs and gradients/backprop.

 Two types of test cases are supported:
 1. TestCase - Can be used to check op outputs, as well as gradients
 2. OpTestCase - Used to check the output(s) of a single op only

 NOTE: For the op coverage information to work properly for ND4J tests, we need the op validation to be run as part of
 the OpValidationSuite test suite. * Otherwise, we could report coverage information before all test have run -
 underestimating coverage.

 SINGLE OP TEST: OpValidation.validate(new OpTestCase(op).expectedOutputs(0, ))
 - OpTestCase checks the output values of a single op, no backprop/gradients
 - Returns an error message if op failed, or NULL if op passed
 SAMEDIFF TEST: OpValidation.validate(new TestCase(sameDiff).gradientCheck(true).expectedOutput(\"someVar\", ))
 - These tests can be used to check both gradients AND expected output, collecting coverage as required
 - Returns an error message if op failed, or NULL if op passed
 - Note gradientCheck(true) is the default
 - Expected outputs are optional
 - You can specify a function for validating the correctness of each output using TestCase.expected(String, Function)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.validation OpValidation]))

(defn ->op-validation
  "Constructor."
  (^OpValidation []
    (new OpValidation )))

(defn *validate
  "Run test case

  test-case - Test case to run - `org.nd4j.autodiff.validation.TestCase`

  returns: NULL if test passes, or error message otherwise - `java.lang.String`"
  (^java.lang.String [^org.nd4j.autodiff.validation.TestCase test-case]
    (OpValidation/validate test-case))
  (^java.lang.String [^org.nd4j.autodiff.validation.TestCase test-case ^Boolean exceptions-as-error-msg]
    (OpValidation/validate test-case exceptions-as-error-msg)))

(defn *log-coverage-information
  "Log the coverage information

  log-adequately-tested - If true: log details of each op that has both forward and (if appropriate) backward tests - `boolean`
  log-inadequate - If false: log details of each op that does NOT have both forward and (if appropriate) backward tests - `boolean`
  log-unmapped-libnd-4j-ops - `boolean`"
  ([^Boolean log-adequately-tested ^Boolean log-inadequate ^Boolean log-unmapped-libnd-4j-ops]
    (OpValidation/logCoverageInformation log-adequately-tested log-inadequate log-unmapped-libnd-4j-ops)))

