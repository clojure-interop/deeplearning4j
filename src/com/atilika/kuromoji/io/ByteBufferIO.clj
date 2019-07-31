(ns com.atilika.kuromoji.io.ByteBufferIO
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.io ByteBufferIO]))

(defn ->byte-buffer-io
  "Constructor."
  (^ByteBufferIO []
    (new ByteBufferIO )))

(defn *read
  "input - `java.io.InputStream`

  returns: `java.nio.ByteBuffer`

  throws: java.io.IOException"
  (^java.nio.ByteBuffer [^java.io.InputStream input]
    (ByteBufferIO/read input)))

(defn *write
  "output - `java.io.OutputStream`
  buffer - `java.nio.ByteBuffer`

  throws: java.io.IOException"
  ([^java.io.OutputStream output ^java.nio.ByteBuffer buffer]
    (ByteBufferIO/write output buffer)))

