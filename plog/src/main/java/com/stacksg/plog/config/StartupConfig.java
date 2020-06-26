package com.stacksg.plog.config;

import com.stacksg.plog.model.domain.Options;
import com.stacksg.plog.model.dto.PlogConst;
import com.stacksg.plog.service.MenuService;
import com.stacksg.plog.service.OptionsService;
import com.stacksg.plog.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;

/**
 * @author : admin
 *
 * 应用启动加载数据（缓存初始化数据）
 */
@Configuration
public class StartupConfig implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private OptionsService optionsService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private ThemeService themeService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		this.loadOptions();
		this.loadMenus();
		this.loadThemeName();
	}

	/**
	 * 加载设置选项
	 */
	private void loadOptions() {
		List<Options> listMap = optionsService.selectMap();
		if (listMap.size() > 0 && !listMap.isEmpty()) {
			for (Options options : listMap) {
				PlogConst.OPTIONS.put(options.getOptionName(), options.getOptionValue());
			}
		}
	}

	/**
	 * 加载菜单
	 */
	private void loadMenus() {
		PlogConst.MENUS = menuService.findMenus();
	}
	/**
	 * 加载主题
	 */
	private void loadThemeName() {
		PlogConst.THEME_NAME=themeService.getEnabledTheme();
	}

}
