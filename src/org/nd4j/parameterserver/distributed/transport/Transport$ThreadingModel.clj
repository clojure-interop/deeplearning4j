(ns org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.transport Transport$ThreadingModel]))

(def SAME_THREAD
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel"
  Transport$ThreadingModel/SAME_THREAD)

(def SINGLE_THREAD
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel"
  Transport$ThreadingModel/SINGLE_THREAD)

(def DEDICATED_THREADS
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel"
  Transport$ThreadingModel/DEDICATED_THREADS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Transport.ThreadingModel c : Transport.ThreadingModel.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel[]`"
  ([]
    (Transport$ThreadingModel/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel [^java.lang.String name]
    (Transport$ThreadingModel/valueOf name)))

