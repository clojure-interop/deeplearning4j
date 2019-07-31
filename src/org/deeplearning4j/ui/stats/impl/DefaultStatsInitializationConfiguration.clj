(ns org.deeplearning4j.ui.stats.impl.DefaultStatsInitializationConfiguration
  "Created by Alex on 07/10/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.impl DefaultStatsInitializationConfiguration]))

(defn ->default-stats-initialization-configuration
  "Constructor."
  (^DefaultStatsInitializationConfiguration []
    (new DefaultStatsInitializationConfiguration )))

(defn collect-software-info
  "Description copied from interface: StatsInitializationConfiguration

  returns: true if software information should be collected; false if not - `boolean`"
  (^Boolean [^DefaultStatsInitializationConfiguration this]
    (-> this (.collectSoftwareInfo))))

(defn collect-hardware-info
  "Description copied from interface: StatsInitializationConfiguration

  returns: true if hardware information should be collected - `boolean`"
  (^Boolean [^DefaultStatsInitializationConfiguration this]
    (-> this (.collectHardwareInfo))))

(defn collect-model-info
  "Description copied from interface: StatsInitializationConfiguration

  returns: true if model information should be collected - `boolean`"
  (^Boolean [^DefaultStatsInitializationConfiguration this]
    (-> this (.collectModelInfo))))

