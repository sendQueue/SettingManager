package de.vinii.management.settings;

import de.vinii.management.module.Module;

/**
 * @author sendQueue <Vinii>
 * <p>
 * Further info at github@vinii.de, file created at 17.06.2021.
 */
public class Setting {
    private String name;
    //combo modes -> e.g. AAC, NCP, WATCHDOG
    private String[] modes;
    private String mode;
    //checkbox state -> un/ticked & if decimals allowed
    private boolean state, decimal;

    // min, max, current values
    private float min, max, current;

    private int[] valueArray, valueRange;
    //type of setting -> boolean, combo, value
    private SettingType settingType;
    //whos setting
    private Module module;

    public Setting(String name, boolean state, Module module){
        this.name = name;
        this.state = state;
        this.module = module;
        this.settingType = SettingType.BOOLEAN;
    }

    public Setting(String name, int[] valueArray, int[] valueRange, Module module){
        this.name = name;
        this.valueArray = valueArray;
        this.valueRange = valueRange;
        this.module = module;
        this.settingType = SettingType.VALUE_ARRAY;
    }

    public Setting(String name, String[] modes, String mode, Module module){
        this.name = name;
        this.modes = modes;
        this.mode = mode;
        this.module = module;
        this.settingType = SettingType.COMBO;
    }

    public Setting(String name, float min, float max, float current, boolean decimal, Module module){
        this.name = name;
        this.min = min;
        this.max = max;
        this.current = current;
        this.decimal = decimal;
        this.module = module;
        this.settingType = SettingType.VALUE;
    }

    public float getCurrentValue() {
        return current;
    }

    public void setCurrentValue(float current) {
        this.current = current;
    }

    public float getMinValue() {
        return min;
    }

    public float getMaxValue() {
        return max;
    }

    public boolean isDecimal() {
        return decimal;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getMode() {
        return mode;
    }

    public String[] getModes() {
        return modes;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int[] getValueArray() {
        return valueArray;
    }

    public void setValueArray(int[] valueArray) {
        this.valueArray = valueArray;
    }

    public String getName() {
        return name;
    }

    public Module getModule() {
        return module;
    }

    public SettingType getSettingType() {
        return settingType;
    }
}
