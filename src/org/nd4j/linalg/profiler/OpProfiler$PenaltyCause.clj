(ns org.nd4j.linalg.profiler.OpProfiler$PenaltyCause
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler OpProfiler$PenaltyCause]))

(def NONE
  "Enum Constant.

  type: org.nd4j.linalg.profiler.OpProfiler$PenaltyCause"
  OpProfiler$PenaltyCause/NONE)

(def NON_EWS_ACCESS
  "Enum Constant.

  type: org.nd4j.linalg.profiler.OpProfiler$PenaltyCause"
  OpProfiler$PenaltyCause/NON_EWS_ACCESS)

(def STRIDED_ACCESS
  "Enum Constant.

  type: org.nd4j.linalg.profiler.OpProfiler$PenaltyCause"
  OpProfiler$PenaltyCause/STRIDED_ACCESS)

(def MIXED_ORDER
  "Enum Constant.

  type: org.nd4j.linalg.profiler.OpProfiler$PenaltyCause"
  OpProfiler$PenaltyCause/MIXED_ORDER)

(def TAD_NON_EWS_ACCESS
  "Enum Constant.

  type: org.nd4j.linalg.profiler.OpProfiler$PenaltyCause"
  OpProfiler$PenaltyCause/TAD_NON_EWS_ACCESS)

(def TAD_STRIDED_ACCESS
  "Enum Constant.

  type: org.nd4j.linalg.profiler.OpProfiler$PenaltyCause"
  OpProfiler$PenaltyCause/TAD_STRIDED_ACCESS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OpProfiler.PenaltyCause c : OpProfiler.PenaltyCause.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.profiler.OpProfiler$PenaltyCause[]`"
  ([]
    (OpProfiler$PenaltyCause/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.profiler.OpProfiler$PenaltyCause`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.profiler.OpProfiler$PenaltyCause [^java.lang.String name]
    (OpProfiler$PenaltyCause/valueOf name)))

