(ns org.nd4j.linalg.api.buffer.util.DataTypeUtil
  "Manipulates the data opType
 for the nd4j context"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer.util DataTypeUtil]))

(defn ->data-type-util
  "Constructor."
  (^DataTypeUtil []
    (new DataTypeUtil )))

(defn *length-for-dtype
  "Returns the length for the given data opType

  type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer$Type type]
    (DataTypeUtil/lengthForDtype type)))

(defn *get-dtype-from-context
  "Get the allocation mode from the context

  d-type - `java.lang.String`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^java.lang.String d-type]
    (DataTypeUtil/getDtypeFromContext d-type))
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type []
    (DataTypeUtil/getDtypeFromContext )))

(defn *get-d-type-for-name
  "Gets the name of the alocation mode

  allocation-mode - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: `java.lang.String`"
  (^java.lang.String [^org.nd4j.linalg.api.buffer.DataBuffer$Type allocation-mode]
    (DataTypeUtil/getDTypeForName allocation-mode)))

(defn *set-d-type-for-context
  "Set the allocation mode for the nd4j context
  The value must be one of: heap, java cpp, or direct
  or an @link{IllegalArgumentException} is thrown

  allocation-mode-for-context - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer$Type allocation-mode-for-context]
    (DataTypeUtil/setDTypeForContext allocation-mode-for-context)))

