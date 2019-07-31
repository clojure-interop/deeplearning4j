(ns org.nd4j.jita.allocator.pointers.cuda.CUcontext
  "Created by raver119 on 19.04.16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.pointers.cuda CUcontext]))

(defn ->c-ucontext
  "Constructor.

  address - `long`"
  (^CUcontext [^Long address]
    (new CUcontext address)))

