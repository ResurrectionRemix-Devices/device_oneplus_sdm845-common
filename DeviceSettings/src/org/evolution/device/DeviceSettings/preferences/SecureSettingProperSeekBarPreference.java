package org.evolution.device.DeviceSettings.preferences;

import android.content.Context;
import android.util.AttributeSet;

import org.evolution.device.DeviceSettings.ProperSeekBarPreference;
import org.evolution.device.DeviceSettings.preferences.SecureSettingsStore;

public class SecureSettingProperSeekBarPreference extends ProperSeekBarPreference {

    public SecureSettingProperSeekBarPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingProperSeekBarPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingProperSeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingProperSeekBarPreference(Context context) {
        super(context);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }
}
