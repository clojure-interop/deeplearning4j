(ns org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.component.style StyleDiv$FloatValue]))

(def non
  "Enum Constant.

  type: org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue"
  StyleDiv$FloatValue/non)

(def left
  "Enum Constant.

  type: org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue"
  StyleDiv$FloatValue/left)

(def right
  "Enum Constant.

  type: org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue"
  StyleDiv$FloatValue/right)

(def initial
  "Enum Constant.

  type: org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue"
  StyleDiv$FloatValue/initial)

(def inherit
  "Enum Constant.

  type: org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue"
  StyleDiv$FloatValue/inherit)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (StyleDiv.FloatValue c : StyleDiv.FloatValue.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue[]`"
  ([]
    (StyleDiv$FloatValue/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue [^java.lang.String name]
    (StyleDiv$FloatValue/valueOf name)))

