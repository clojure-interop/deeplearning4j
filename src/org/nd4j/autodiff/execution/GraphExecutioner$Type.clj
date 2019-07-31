(ns org.nd4j.autodiff.execution.GraphExecutioner$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.execution GraphExecutioner$Type]))

(def LOCAL
  "Enum Constant.

  Executor runs on the same box

  type: org.nd4j.autodiff.execution.GraphExecutioner$Type"
  GraphExecutioner$Type/LOCAL)

(def REMOTE
  "Enum Constant.

  Executor runs somewhere else

  type: org.nd4j.autodiff.execution.GraphExecutioner$Type"
  GraphExecutioner$Type/REMOTE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (GraphExecutioner.Type c : GraphExecutioner.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.autodiff.execution.GraphExecutioner$Type[]`"
  ([]
    (GraphExecutioner$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.autodiff.execution.GraphExecutioner$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.autodiff.execution.GraphExecutioner$Type [^java.lang.String name]
    (GraphExecutioner$Type/valueOf name)))

