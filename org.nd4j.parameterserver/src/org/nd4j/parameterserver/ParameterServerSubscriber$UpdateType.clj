(ns org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver ParameterServerSubscriber$UpdateType]))

(def HOGWILD
  "Enum Constant.

  type: org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType"
  ParameterServerSubscriber$UpdateType/HOGWILD)

(def SYNC
  "Enum Constant.

  type: org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType"
  ParameterServerSubscriber$UpdateType/SYNC)

(def TIME_DELAYED
  "Enum Constant.

  type: org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType"
  ParameterServerSubscriber$UpdateType/TIME_DELAYED)

(def SOFTSYNC
  "Enum Constant.

  type: org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType"
  ParameterServerSubscriber$UpdateType/SOFTSYNC)

(def CUSTOM
  "Enum Constant.

  type: org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType"
  ParameterServerSubscriber$UpdateType/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ParameterServerSubscriber.UpdateType c : ParameterServerSubscriber.UpdateType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType[]`"
  ([]
    (ParameterServerSubscriber$UpdateType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.parameterserver.ParameterServerSubscriber$UpdateType [^java.lang.String name]
    (ParameterServerSubscriber$UpdateType/valueOf name)))

