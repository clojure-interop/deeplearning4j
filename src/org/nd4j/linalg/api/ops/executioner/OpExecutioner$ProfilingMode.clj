(ns org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.executioner OpExecutioner$ProfilingMode]))

(def DISABLED
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/DISABLED)

(def NAN_PANIC
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/NAN_PANIC)

(def INF_PANIC
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/INF_PANIC)

(def ANY_PANIC
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/ANY_PANIC)

(def OPERATIONS
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/OPERATIONS)

(def METHODS
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/METHODS)

(def ALL
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/ALL)

(def SCOPE_PANIC
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/SCOPE_PANIC)

(def BANDWIDTH
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode"
  OpExecutioner$ProfilingMode/BANDWIDTH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OpExecutioner.ProfilingMode c : OpExecutioner.ProfilingMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode[]`"
  ([]
    (OpExecutioner$ProfilingMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode [^java.lang.String name]
    (OpExecutioner$ProfilingMode/valueOf name)))

