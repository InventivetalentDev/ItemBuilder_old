package org.inventivetalent.itembuilder;

import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.MetricsLite;

public class ItemBuilderPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		try {
			MetricsLite metrics = new MetricsLite(this);
			if (metrics.start()) {
				getLogger().info("Metrics started");
			}
		} catch (Exception e) {
		}
	}
}
