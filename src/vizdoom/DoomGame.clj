(ns vizdoom.DoomGame
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom DoomGame]))

(defn ->doom-game
  "Constructor."
  (^DoomGame []
    (new DoomGame )))

(defn internal-ptr
  "Instance Field.

  type: long"
  (^Long [^DoomGame this]
    (-> this .-internalPtr)))

(defn set-death-penalty
  "death-penalty - `double`"
  ([^DoomGame this ^Double death-penalty]
    (-> this (.setDeathPenalty death-penalty))))

(defn set-screen-format
  "format - `vizdoom.ScreenFormat`"
  ([^DoomGame this ^vizdoom.ScreenFormat format]
    (-> this (.setScreenFormat format))))

(defn respawn-player
  ""
  ([^DoomGame this]
    (-> this (.respawnPlayer))))

(defn get-episode-start-time
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getEpisodeStartTime))))

(defn get-mode
  "returns: `vizdoom.Mode`"
  (^vizdoom.Mode [^DoomGame this]
    (-> this (.getMode))))

(defn set-button-max-value
  "button - `vizdoom.Button`
  max-value - `double`"
  ([^DoomGame this ^vizdoom.Button button ^Double max-value]
    (-> this (.setButtonMaxValue button max-value))))

(defn multiplayer-game?
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.isMultiplayerGame))))

(defn set-mode
  "mode - `vizdoom.Mode`"
  ([^DoomGame this ^vizdoom.Mode mode]
    (-> this (.setMode mode))))

(defn doom-fixed-to-double
  "doom-fixed - `double`

  returns: `double`"
  (^Double [^DoomGame this ^Double doom-fixed]
    (-> this (.doomFixedToDouble doom-fixed))))

(defn set-automap-render-textures
  "textures - `boolean`"
  ([^DoomGame this ^Boolean textures]
    (-> this (.setAutomapRenderTextures textures))))

(defn get-screen-pitch
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getScreenPitch))))

(defn set-seed
  "seed - `int`"
  ([^DoomGame this ^Integer seed]
    (-> this (.setSeed seed))))

(defn sec-2-doom-tics
  "sec - `double`
  ticrate - `int`

  returns: `double`"
  (^Double [^DoomGame this ^Double sec ^Integer ticrate]
    (-> this (.sec2DoomTics sec ticrate))))

(defn clear-game-args
  ""
  ([^DoomGame this]
    (-> this (.clearGameArgs))))

(defn doom-tics-2-ms
  "tics - `double`
  ticrate - `int`

  returns: `double`"
  (^Double [^DoomGame this ^Double tics ^Integer ticrate]
    (-> this (.doomTics2Ms tics ticrate))))

(defn add-game-args
  "arg - `java.lang.String`"
  ([^DoomGame this ^java.lang.String arg]
    (-> this (.addGameArgs arg))))

(defn set-doom-game-path
  "path - `java.lang.String`"
  ([^DoomGame this ^java.lang.String path]
    (-> this (.setDoomGamePath path))))

(defn replay-episode
  "file - `java.lang.String`
  player - `int`"
  ([^DoomGame this ^java.lang.String file ^Integer player]
    (-> this (.replayEpisode file player)))
  ([^DoomGame this ^java.lang.String file]
    (-> this (.replayEpisode file))))

(defn set-depth-buffer-enabled
  "depth-buffer - `boolean`"
  ([^DoomGame this ^Boolean depth-buffer]
    (-> this (.setDepthBufferEnabled depth-buffer))))

(defn get-available-buttons-size
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getAvailableButtonsSize))))

(defn automap-buffer-enabled?
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.isAutomapBufferEnabled))))

(defn get-last-action
  "returns: `double[]`"
  ([^DoomGame this]
    (-> this (.getLastAction))))

(defn set-automap-mode
  "mode - `vizdoom.AutomapMode`"
  ([^DoomGame this ^vizdoom.AutomapMode mode]
    (-> this (.setAutomapMode mode))))

(defn delta-button?
  "button - `vizdoom.Button`

  returns: `boolean`"
  (^Boolean [^DoomGame this ^vizdoom.Button button]
    (-> this (.isDeltaButton button))))

(defn set-render-corpses
  "corpses - `boolean`"
  ([^DoomGame this ^Boolean corpses]
    (-> this (.setRenderCorpses corpses))))

(defn set-doom-config-path
  "path - `java.lang.String`"
  ([^DoomGame this ^java.lang.String path]
    (-> this (.setDoomConfigPath path))))

(defn send-game-command
  "cmd - `java.lang.String`"
  ([^DoomGame this ^java.lang.String cmd]
    (-> this (.sendGameCommand cmd))))

(defn advance-action
  "tics - `int`
  state-update - `boolean`"
  ([^DoomGame this ^Integer tics ^Boolean state-update]
    (-> this (.advanceAction tics state-update)))
  ([^DoomGame this ^Integer tics]
    (-> this (.advanceAction tics)))
  ([^DoomGame this]
    (-> this (.advanceAction))))

(defn set-doom-scenario-path
  "path - `java.lang.String`"
  ([^DoomGame this ^java.lang.String path]
    (-> this (.setDoomScenarioPath path))))

(defn get-state
  "returns: `vizdoom.GameState`"
  (^vizdoom.GameState [^DoomGame this]
    (-> this (.getState))))

(defn depth-buffer-enabled?
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.isDepthBufferEnabled))))

(defn set-ticrate
  "ticrate - `int`"
  ([^DoomGame this ^Integer ticrate]
    (-> this (.setTicrate ticrate))))

(defn episode-finished?
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.isEpisodeFinished))))

(defn set-render-messages
  "messages - `boolean`"
  ([^DoomGame this ^Boolean messages]
    (-> this (.setRenderMessages messages))))

(defn clear-available-game-variables
  ""
  ([^DoomGame this]
    (-> this (.clearAvailableGameVariables))))

(defn set-render-effects-sprites
  "sprites - `boolean`"
  ([^DoomGame this ^Boolean sprites]
    (-> this (.setRenderEffectsSprites sprites))))

(defn get-screen-height
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getScreenHeight))))

(defn get-last-reward
  "returns: `double`"
  (^Double [^DoomGame this]
    (-> this (.getLastReward))))

(defn set-console-enabled
  "console - `boolean`"
  ([^DoomGame this ^Boolean console]
    (-> this (.setConsoleEnabled console))))

(defn get-episode-timeout
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getEpisodeTimeout))))

(defn get-available-game-variables
  "returns: `vizdoom.GameVariable[]`"
  ([^DoomGame this]
    (-> this (.getAvailableGameVariables))))

(defn set-window-visible
  "visibility - `boolean`"
  ([^DoomGame this ^Boolean visibility]
    (-> this (.setWindowVisible visibility))))

(defn player-dead?
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.isPlayerDead))))

(defn set-automap-rotate
  "rotate - `boolean`"
  ([^DoomGame this ^Boolean rotate]
    (-> this (.setAutomapRotate rotate))))

(defn new-episode?
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.isNewEpisode))))

(defn get-episode-time
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getEpisodeTime))))

(defn set-available-buttons
  "buttons - `vizdoom.Button[]`"
  ([^DoomGame this buttons]
    (-> this (.setAvailableButtons buttons))))

(defn set-render-weapon
  "weapon - `boolean`"
  ([^DoomGame this ^Boolean weapon]
    (-> this (.setRenderWeapon weapon))))

(defn set-episode-start-time
  "tics - `int`"
  ([^DoomGame this ^Integer tics]
    (-> this (.setEpisodeStartTime tics))))

(defn set-doom-map
  "map - `java.lang.String`"
  ([^DoomGame this ^java.lang.String map]
    (-> this (.setDoomMap map))))

(defn set-episode-timeout
  "tics - `int`"
  ([^DoomGame this ^Integer tics]
    (-> this (.setEpisodeTimeout tics))))

(defn close
  ""
  ([^DoomGame this]
    (-> this (.close))))

(defn set-render-crosshair
  "crosshair - `boolean`"
  ([^DoomGame this ^Boolean crosshair]
    (-> this (.setRenderCrosshair crosshair))))

(defn get-button-max-value
  "button - `vizdoom.Button`

  returns: `double`"
  (^Double [^DoomGame this ^vizdoom.Button button]
    (-> this (.getButtonMaxValue button))))

(defn set-sound-enabled
  "sound - `boolean`"
  ([^DoomGame this ^Boolean sound]
    (-> this (.setSoundEnabled sound))))

(defn get-available-game-variables-size
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getAvailableGameVariablesSize))))

(defn get-game-variable
  "var - `vizdoom.GameVariable`

  returns: `double`"
  (^Double [^DoomGame this ^vizdoom.GameVariable var]
    (-> this (.getGameVariable var))))

(defn add-available-game-variable
  "var - `vizdoom.GameVariable`"
  ([^DoomGame this ^vizdoom.GameVariable var]
    (-> this (.addAvailableGameVariable var))))

(defn make-action
  "actions - `double[]`
  tics - `int`

  returns: `double`"
  (^Double [^DoomGame this actions ^Integer tics]
    (-> this (.makeAction actions tics)))
  (^Double [^DoomGame this actions]
    (-> this (.makeAction actions))))

(defn doom-tics-2-sec
  "tics - `double`
  ticrate - `int`

  returns: `double`"
  (^Double [^DoomGame this ^Double tics ^Integer ticrate]
    (-> this (.doomTics2Sec tics ticrate))))

(defn set-render-decals
  "decals - `boolean`"
  ([^DoomGame this ^Boolean decals]
    (-> this (.setRenderDecals decals))))

(defn binary-button?
  "button - `vizdoom.Button`

  returns: `boolean`"
  (^Boolean [^DoomGame this ^vizdoom.Button button]
    (-> this (.isBinaryButton button))))

(defn set-doom-skill
  "skill - `int`"
  ([^DoomGame this ^Integer skill]
    (-> this (.setDoomSkill skill))))

(defn set-available-game-variables
  "game-variables - `vizdoom.GameVariable[]`"
  ([^DoomGame this game-variables]
    (-> this (.setAvailableGameVariables game-variables))))

(defn set-render-hud
  "hud - `boolean`"
  ([^DoomGame this ^Boolean hud]
    (-> this (.setRenderHud hud))))

(defn load-config
  "file - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^DoomGame this ^java.lang.String file]
    (-> this (.loadConfig file))))

(defn init
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.init))))

(defn get-screen-format
  "returns: `vizdoom.ScreenFormat`"
  (^vizdoom.ScreenFormat [^DoomGame this]
    (-> this (.getScreenFormat))))

(defn running?
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.isRunning))))

(defn ms-2-doom-tics
  "ms - `double`
  ticrate - `int`

  returns: `double`"
  (^Double [^DoomGame this ^Double ms ^Integer ticrate]
    (-> this (.ms2DoomTics ms ticrate))))

(defn get-available-buttons
  "returns: `vizdoom.Button[]`"
  ([^DoomGame this]
    (-> this (.getAvailableButtons))))

(defn add-available-button
  "button - `vizdoom.Button`
  max-value - `double`"
  ([^DoomGame this ^vizdoom.Button button ^Double max-value]
    (-> this (.addAvailableButton button max-value)))
  ([^DoomGame this ^vizdoom.Button button]
    (-> this (.addAvailableButton button))))

(defn get-screen-channels
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getScreenChannels))))

(defn set-vi-z-doom-path
  "path - `java.lang.String`"
  ([^DoomGame this ^java.lang.String path]
    (-> this (.setViZDoomPath path))))

(defn clear-available-buttons
  ""
  ([^DoomGame this]
    (-> this (.clearAvailableButtons))))

(defn get-seed
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getSeed))))

(defn set-screen-resolution
  "resolution - `vizdoom.ScreenResolution`"
  ([^DoomGame this ^vizdoom.ScreenResolution resolution]
    (-> this (.setScreenResolution resolution))))

(defn set-action
  "actions - `double[]`"
  ([^DoomGame this actions]
    (-> this (.setAction actions))))

(defn set-render-minimal-hud
  "minimal-hud - `boolean`"
  ([^DoomGame this ^Boolean minimal-hud]
    (-> this (.setRenderMinimalHud minimal-hud))))

(defn get-death-penalty
  "returns: `double`"
  (^Double [^DoomGame this]
    (-> this (.getDeathPenalty))))

(defn set-automap-buffer-enabled
  "automap-buffer - `boolean`"
  ([^DoomGame this ^Boolean automap-buffer]
    (-> this (.setAutomapBufferEnabled automap-buffer))))

(defn set-labels-buffer-enabled
  "labels-buffer - `boolean`"
  ([^DoomGame this ^Boolean labels-buffer]
    (-> this (.setLabelsBufferEnabled labels-buffer))))

(defn get-screen-size
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getScreenSize))))

(defn get-ticrate
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getTicrate))))

(defn set-render-all-frames
  "all-frames - `boolean`"
  ([^DoomGame this ^Boolean all-frames]
    (-> this (.setRenderAllFrames all-frames))))

(defn get-total-reward
  "returns: `double`"
  (^Double [^DoomGame this]
    (-> this (.getTotalReward))))

(defn get-screen-width
  "returns: `int`"
  (^Integer [^DoomGame this]
    (-> this (.getScreenWidth))))

(defn set-render-screen-flashes
  "flashes - `boolean`"
  ([^DoomGame this ^Boolean flashes]
    (-> this (.setRenderScreenFlashes flashes))))

(defn set-living-reward
  "living-reward - `double`"
  ([^DoomGame this ^Double living-reward]
    (-> this (.setLivingReward living-reward))))

(defn labels-buffer-enabled?
  "returns: `boolean`"
  (^Boolean [^DoomGame this]
    (-> this (.isLabelsBufferEnabled))))

(defn get-living-reward
  "returns: `double`"
  (^Double [^DoomGame this]
    (-> this (.getLivingReward))))

(defn set-render-particles
  "particles - `boolean`"
  ([^DoomGame this ^Boolean particles]
    (-> this (.setRenderParticles particles))))

(defn new-episode
  "file - `java.lang.String`"
  ([^DoomGame this ^java.lang.String file]
    (-> this (.newEpisode file)))
  ([^DoomGame this]
    (-> this (.newEpisode))))

