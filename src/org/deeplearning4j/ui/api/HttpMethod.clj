(ns org.deeplearning4j.ui.api.HttpMethod
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api HttpMethod]))

(def GET
  "Enum Constant.

  type: org.deeplearning4j.ui.api.HttpMethod"
  HttpMethod/GET)

(def PUT
  "Enum Constant.

  type: org.deeplearning4j.ui.api.HttpMethod"
  HttpMethod/PUT)

(def POST
  "Enum Constant.

  type: org.deeplearning4j.ui.api.HttpMethod"
  HttpMethod/POST)

(def DELETE
  "Enum Constant.

  type: org.deeplearning4j.ui.api.HttpMethod"
  HttpMethod/DELETE)

(def HEAD
  "Enum Constant.

  type: org.deeplearning4j.ui.api.HttpMethod"
  HttpMethod/HEAD)

(def OPTIONS
  "Enum Constant.

  type: org.deeplearning4j.ui.api.HttpMethod"
  HttpMethod/OPTIONS)

(def PATCH
  "Enum Constant.

  type: org.deeplearning4j.ui.api.HttpMethod"
  HttpMethod/PATCH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (HttpMethod c : HttpMethod.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.ui.api.HttpMethod[]`"
  ([]
    (HttpMethod/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.ui.api.HttpMethod`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.ui.api.HttpMethod [^java.lang.String name]
    (HttpMethod/valueOf name)))

