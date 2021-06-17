package de.vinii.management.settings;

import de.vinii.management.setting.Setting;

import java.util.ArrayList;

/**
 * @author sendQueue <Vinii>
 * <p>
 * Further info at github@vinii.de, file created at 17.06.2021.
 */
public class SettingManager {
    private static ArrayList<Setting> settings;

    public static void initialize() {
        settings = new ArrayList<>();
    }

    public static void addSetting(Setting setting) {
        settings.add(setting);
    }

    public static ArrayList<Setting> getSettings() {
        return settings;
    }

}
