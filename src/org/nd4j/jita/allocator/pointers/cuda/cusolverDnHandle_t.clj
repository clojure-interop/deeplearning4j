(ns org.nd4j.jita.allocator.pointers.cuda.cusolverDnHandle_t
  "Created by rcorbish 30-OCT-2016"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.pointers.cuda cusolverDnHandle_t]))

(defn ->cusolver-dn-handle-t
  "Constructor.

  pointer - `org.bytedeco.javacpp.Pointer`"
  (^cusolverDnHandle_t [^org.bytedeco.javacpp.Pointer pointer]
    (new cusolverDnHandle_t pointer)))

