(ns org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.generator GridSearchCandidateGenerator$Mode]))

(def Sequential
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode"
  GridSearchCandidateGenerator$Mode/Sequential)

(def RandomOrder
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode"
  GridSearchCandidateGenerator$Mode/RandomOrder)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (GridSearchCandidateGenerator.Mode c : GridSearchCandidateGenerator.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode[]`"
  ([]
    (GridSearchCandidateGenerator$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode [^java.lang.String name]
    (GridSearchCandidateGenerator$Mode/valueOf name)))

