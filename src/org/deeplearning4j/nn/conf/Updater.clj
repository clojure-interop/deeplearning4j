(ns org.deeplearning4j.nn.conf.Updater
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf Updater]))

(def SGD
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/SGD)

(def ADAM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/ADAM)

(def ADAMAX
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/ADAMAX)

(def ADADELTA
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/ADADELTA)

(def NESTEROVS
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/NESTEROVS)

(def NADAM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/NADAM)

(def ADAGRAD
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/ADAGRAD)

(def RMSPROP
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/RMSPROP)

(def NONE
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/NONE)

(def CUSTOM
  "Enum Constant.

  Deprecated.

  type: org.deeplearning4j.nn.conf.Updater"
  Updater/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Updater c : Updater.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.Updater[]`"
  ([]
    (Updater/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.Updater`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.Updater [^java.lang.String name]
    (Updater/valueOf name)))

(defn get-i-updater-with-default-config
  "returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^Updater this]
    (-> this (.getIUpdaterWithDefaultConfig))))

