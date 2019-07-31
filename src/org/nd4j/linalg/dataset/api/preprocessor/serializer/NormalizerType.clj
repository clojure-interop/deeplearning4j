(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer NormalizerType]))

(def STANDARDIZE
  "Enum Constant.

  type: org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType"
  NormalizerType/STANDARDIZE)

(def MIN_MAX
  "Enum Constant.

  type: org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType"
  NormalizerType/MIN_MAX)

(def IMAGE_MIN_MAX
  "Enum Constant.

  type: org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType"
  NormalizerType/IMAGE_MIN_MAX)

(def IMAGE_VGG16
  "Enum Constant.

  type: org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType"
  NormalizerType/IMAGE_VGG16)

(def MULTI_STANDARDIZE
  "Enum Constant.

  type: org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType"
  NormalizerType/MULTI_STANDARDIZE)

(def MULTI_MIN_MAX
  "Enum Constant.

  type: org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType"
  NormalizerType/MULTI_MIN_MAX)

(def MULTI_HYBRID
  "Enum Constant.

  type: org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType"
  NormalizerType/MULTI_HYBRID)

(def CUSTOM
  "Enum Constant.

  type: org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType"
  NormalizerType/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (NormalizerType c : NormalizerType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType[]`"
  ([]
    (NormalizerType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^java.lang.String name]
    (NormalizerType/valueOf name)))

