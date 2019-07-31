(ns org.nd4j.linalg.util.NioUtil
  "NioUtils for operations on
 nio buffers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util NioUtil]))

(defn *copy-at-stride
  "Copy from the given from buffer
  to the to buffer at the specified
  offsets and strides

  n - `int`
  buffer-type - `org.nd4j.linalg.util.NioUtil$BufferType`
  from - the origin buffer - `java.nio.ByteBuffer`
  from-offset - the starting offset - `int`
  from-stride - the stride at which to copy from the origin - `int`
  to - the destination buffer - `java.nio.ByteBuffer`
  to-offset - the starting point - `int`
  to-stride - the to stride - `int`"
  ([^Integer n ^org.nd4j.linalg.util.NioUtil$BufferType buffer-type ^java.nio.ByteBuffer from ^Integer from-offset ^Integer from-stride ^java.nio.ByteBuffer to ^Integer to-offset ^Integer to-stride]
    (NioUtil/copyAtStride n buffer-type from from-offset from-stride to to-offset to-stride)))

