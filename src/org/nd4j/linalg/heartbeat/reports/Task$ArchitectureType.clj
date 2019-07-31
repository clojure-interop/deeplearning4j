(ns org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.heartbeat.reports Task$ArchitectureType]))

(def CONVOLUTION
  "Enum Constant.

  type: org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType"
  Task$ArchitectureType/CONVOLUTION)

(def RECURRENT
  "Enum Constant.

  type: org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType"
  Task$ArchitectureType/RECURRENT)

(def RBM
  "Enum Constant.

  type: org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType"
  Task$ArchitectureType/RBM)

(def WORDVECTORS
  "Enum Constant.

  type: org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType"
  Task$ArchitectureType/WORDVECTORS)

(def UNKNOWN
  "Enum Constant.

  type: org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType"
  Task$ArchitectureType/UNKNOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Task.ArchitectureType c : Task.ArchitectureType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType[]`"
  ([]
    (Task$ArchitectureType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.heartbeat.reports.Task$ArchitectureType [^java.lang.String name]
    (Task$ArchitectureType/valueOf name)))

