(ns org.nd4j.linalg.cpu.nativecpu.blas.CpuLevel1
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.blas CpuLevel1]))

(defn ->cpu-level-1
  "Constructor."
  (^CpuLevel1 []
    (new CpuLevel1 )))

(defn haxpy
  "n - `long`
  alpha - `float`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`"
  ([^CpuLevel1 this ^Long n ^Float alpha ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.haxpy n alpha x offset-x incr-x y offset-y incr-y))))

(defn saxpy
  "n - `long`
  alpha - `float`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`"
  ([^CpuLevel1 this ^Long n ^Float alpha ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.saxpy n alpha x offset-x incr-x y offset-y incr-y))))

(defn daxpy
  "n - `long`
  alpha - `double`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`"
  ([^CpuLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.daxpy n alpha x offset-x incr-x y offset-y incr-y))))

