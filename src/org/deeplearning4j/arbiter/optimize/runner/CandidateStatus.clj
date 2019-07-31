(ns org.deeplearning4j.arbiter.optimize.runner.CandidateStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.runner CandidateStatus]))

(def Created
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.runner.CandidateStatus"
  CandidateStatus/Created)

(def Running
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.runner.CandidateStatus"
  CandidateStatus/Running)

(def Complete
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.runner.CandidateStatus"
  CandidateStatus/Complete)

(def Failed
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.runner.CandidateStatus"
  CandidateStatus/Failed)

(def Cancelled
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.runner.CandidateStatus"
  CandidateStatus/Cancelled)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (CandidateStatus c : CandidateStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.arbiter.optimize.runner.CandidateStatus[]`"
  ([]
    (CandidateStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.arbiter.optimize.runner.CandidateStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.arbiter.optimize.runner.CandidateStatus [^java.lang.String name]
    (CandidateStatus/valueOf name)))

