(ns org.nd4j.graph.DataType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph DataType]))

(def *-inherit
  "Static Constant.

  type: byte"
  DataType/INHERIT)

(def *-bool
  "Static Constant.

  type: byte"
  DataType/BOOL)

(def *-float-8
  "Static Constant.

  type: byte"
  DataType/FLOAT8)

(def *-half
  "Static Constant.

  type: byte"
  DataType/HALF)

(def *-half-2
  "Static Constant.

  type: byte"
  DataType/HALF2)

(def *-float
  "Static Constant.

  type: byte"
  DataType/FLOAT)

(def *-double
  "Static Constant.

  type: byte"
  DataType/DOUBLE)

(def *-int-8
  "Static Constant.

  type: byte"
  DataType/INT8)

(def *-int-16
  "Static Constant.

  type: byte"
  DataType/INT16)

(def *-int-32
  "Static Constant.

  type: byte"
  DataType/INT32)

(def *-int-64
  "Static Constant.

  type: byte"
  DataType/INT64)

(def *-uint-8
  "Static Constant.

  type: byte"
  DataType/UINT8)

(def *-uint-16
  "Static Constant.

  type: byte"
  DataType/UINT16)

(def *-uint-32
  "Static Constant.

  type: byte"
  DataType/UINT32)

(def *-uint-64
  "Static Constant.

  type: byte"
  DataType/UINT64)

(def *-qint-8
  "Static Constant.

  type: byte"
  DataType/QINT8)

(def *-qint-16
  "Static Constant.

  type: byte"
  DataType/QINT16)

(def *-names
  "Static Constant.

  type: java.lang.String[]"
  DataType/names)

(defn *name
  "e - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer e]
    (DataType/name e)))

