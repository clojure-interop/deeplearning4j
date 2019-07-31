(ns org.nd4j.parameterserver.distributed.logic.routing.InterleavedRouter
  "This is main router implementation for VoidParameterServer
 Basic idea: We route TrainingMessages conditionally, based on Huffman tree index (aka frequency-ordered position)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.routing InterleavedRouter]))

(defn ->interleaved-router
  "Constructor.

  default-index - `int`"
  (^InterleavedRouter [^Integer default-index]
    (new InterleavedRouter default-index))
  (^InterleavedRouter []
    (new InterleavedRouter )))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`"
  ([^InterleavedRouter this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport]
    (-> this (.init void-configuration transport))))

(defn assign-target
  "message - `org.nd4j.parameterserver.distributed.messages.TrainingMessage`

  returns: `int`"
  (^Integer [^InterleavedRouter this ^org.nd4j.parameterserver.distributed.messages.TrainingMessage message]
    (-> this (.assignTarget message))))

