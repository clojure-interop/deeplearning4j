(ns org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.graph ElementWiseVertex$Op]))

(def Add
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op"
  ElementWiseVertex$Op/Add)

(def Subtract
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op"
  ElementWiseVertex$Op/Subtract)

(def Product
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op"
  ElementWiseVertex$Op/Product)

(def Average
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op"
  ElementWiseVertex$Op/Average)

(def Max
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op"
  ElementWiseVertex$Op/Max)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ElementWiseVertex.Op c : ElementWiseVertex.Op.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op[]`"
  ([]
    (ElementWiseVertex$Op/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op [^java.lang.String name]
    (ElementWiseVertex$Op/valueOf name)))

