(ns org.nd4j.linalg.heartbeat.reports.Task$NetworkType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.heartbeat.reports Task$NetworkType]))

(def MultilayerNetwork
  "Enum Constant.

  type: org.nd4j.linalg.heartbeat.reports.Task$NetworkType"
  Task$NetworkType/MultilayerNetwork)

(def ComputationalGraph
  "Enum Constant.

  type: org.nd4j.linalg.heartbeat.reports.Task$NetworkType"
  Task$NetworkType/ComputationalGraph)

(def DenseNetwork
  "Enum Constant.

  type: org.nd4j.linalg.heartbeat.reports.Task$NetworkType"
  Task$NetworkType/DenseNetwork)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Task.NetworkType c : Task.NetworkType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.heartbeat.reports.Task$NetworkType[]`"
  ([]
    (Task$NetworkType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.heartbeat.reports.Task$NetworkType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.heartbeat.reports.Task$NetworkType [^java.lang.String name]
    (Task$NetworkType/valueOf name)))

