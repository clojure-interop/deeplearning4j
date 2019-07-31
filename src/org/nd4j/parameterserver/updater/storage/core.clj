(ns org.nd4j.parameterserver.updater.storage.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.nd4j.parameterserver.updater.storage.BaseUpdateStorage])
(require '[org.nd4j.parameterserver.updater.storage.InMemoryUpdateStorage])
(require '[org.nd4j.parameterserver.updater.storage.NoUpdateStorage])
(require '[org.nd4j.parameterserver.updater.storage.RocksDbStorage])
(require '[org.nd4j.parameterserver.updater.storage.UpdateStorage])
